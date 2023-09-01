/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivosbinarios_lab;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gabriela Mejía
 */
public class EmpleadosManager {
        private RandomAccessFile rcods, remps;

    public EmpleadosManager() {
        try {
            //1- Asegurar que el folder company exista
            File f = new File("company");
            f.mkdir();
            //2- Instanciar las RAFs dentro company
            rcods = new RandomAccessFile("company/codigo.emp", "rw");
            remps = new RandomAccessFile("company/empleados.emp", "rw");

            //3- Inicializar el archivo de codigo si es nuevo
            initCode();
        } catch (IOException e) {
            System.out.println("No deberia de pasar esto.");
        }
    }

    private void initCode() throws IOException {
        if (rcods.length() == 0) {
            rcods.writeInt(1);
        }
    }

    private int getCode() throws IOException {
        rcods.seek(0);
        int code = rcods.readInt();
        rcods.seek(0);
        rcods.writeInt(code + 1);
        return code;
    }

    public void addEmployee(String name, double salary) throws IOException {
        /*Formato:
        codigo
        nombre
        salario
        fecha contratacion
        fecha despido
         */
        remps.seek(remps.length());
        int code = getCode();
        remps.writeInt(code);
        remps.writeUTF(name);
        remps.writeDouble(salary);
        remps.writeLong(Calendar.getInstance().getTimeInMillis());
        remps.writeLong(0);
        //Aseguramos sus archivos individuales
        createEmployeeFolders(code);
    }

    public String employeeFolder(int code) {
        return "company/empleado" + code;
    }

    private void createEmployeeFolders(int code) throws IOException {
        //Crear folder empleado+code
        File edir = new File(employeeFolder(code));
        edir.mkdir();
        //Crear los archivos de las ventas
        createYearSalesFileFor(code);
    }
    
    private RandomAccessFile salesFileFor(int code) throws IOException{
        String dirPadre=employeeFolder(code);
        int yearActual=Calendar.getInstance().get(Calendar.YEAR);
        String path=dirPadre+"/ventas"+yearActual+".emp";
        return new RandomAccessFile(path, "rw");
    }
    
    private void createYearSalesFileFor(int code) throws IOException{
        RandomAccessFile ryear=salesFileFor(code);
        if(ryear.length()==0){
            for(int m=0;m<12;m++){
                ryear.writeDouble(0);
                ryear.writeBoolean(false);
            }
        }
    }
    
    /*
    Imprime: 
    Realizar una lista de empleados NO DESPEDIDOS con la siguiente estructura
    Codigo - Nombre - Salario - Fecha Contratacion 
    */
    public void employeeList() throws IOException{
        remps.seek(0);
        while(remps.getFilePointer()<remps.length()){
            int code=remps.readInt();
            String nombre=remps.readUTF();
            double salary=remps.readDouble();
            Date fecha=new Date(remps.readLong());
            if(remps.readLong()==0){
                System.out.println(code+" - "+ nombre+" - $"+salary+" - "+fecha);
            }
        }
    }
    
    private boolean isEmployeeActive(int code) throws IOException{
        remps.seek(0);
        while(remps.getFilePointer()<remps.length()){
            int cod=remps.readInt();
            long pos=remps.getFilePointer();
            remps.readUTF();
            remps.skipBytes(16);
            if(remps.readLong()==0 && cod==code){
                remps.seek(pos);
                return true;
            }
        }
        return false;
    }
    
    public boolean fireEmployee(int code) throws IOException{
        if(isEmployeeActive(code)){
            String name = remps.readUTF();
            remps.skipBytes(16);
            remps.writeLong(new Date().getTime());
            System.out.println("Despidiendo a: "+name);
            return true;
        }
        return false;
    }
}
