package archivosbinarios_lab;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela Mejía && David Zelaya && Miguel Medrano 
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
        CrearArchivoRecibos(code);
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
                ryear.writeBoolean(false);
                ryear.writeDouble(0);
            }
        }
    }
    
    /*
    Imprime: 
    Realizar una lista de empleados NO DESPEDIDOS con la siguiente estructura
    Codigo - Nombre - Salario - Fecha Contratacion 
    */
      public String Employeelist ()throws IOException{
        remps.seek(0);
        String lista="";
        while(remps.getFilePointer()<remps.length()){
            int code=remps.readInt();
            String name=remps.readUTF();
            double salary=remps.readDouble();
            Date  fecha=new Date(remps.readLong());
            if(remps.readLong()==0){
                lista+="\nCodigo: "+code
                        +"\nNombre: "+name
                        +"\nSalario: "+salary+" $$"
                        +"\nContratacion: "+fecha;
            }   
        }
        return lista;
        
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
    
   public boolean fireEmployee(int code)throws IOException{
    if(isEmployeeActive(code)){
        String name=remps.readUTF();
        remps.skipBytes(16);
        remps.writeLong(new Date().getTime());
        JOptionPane.showMessageDialog(null, "Despidiendo a "+name);
    return true;
    }
    JOptionPane.showMessageDialog(null, "Error al despedir a este empleado");
    return false;
}
   
   public void addSalestoEmployee(int code,double sales)throws IOException{
        RandomAccessFile ryear=salesFileFor(code);
        ryear.seek(0);
        
        int pos=0;
            for(int i=0;i<Calendar.getInstance().get(Calendar.MONTH);i++){
                ryear.skipBytes(9);
                pos+=5;
            }
            
            if(ryear.readBoolean()==false){
            ryear.seek(pos);
            ryear.writeBoolean(true);
            ryear.writeDouble(sales);
            JOptionPane.showMessageDialog(null, "Se ha pagado con exito");
            Pagar(code,sales);
            
            }
       JOptionPane.showMessageDialog(null, "Error al pagar");
   }
   
    
    private RandomAccessFile CrearArchivoRecibos (int code) throws IOException{
        RandomAccessFile hola=new RandomAccessFile("company/empleado"+code,"rw");
        return hola;
    }
    
    private double salario(int code)throws IOException{
        remps.seek(0);
        double salario=0;
        
        while(remps.getFilePointer()<remps.length()){
        int codigo=remps.readInt();
        remps.readUTF();
        double salary=remps.readDouble();
        remps.skipBytes(16);
        if(codigo==code){
            salario=salary;
        }
        
        }
        
        return salario;
    }
    
    
    public void Pagar(int code,double venta)throws IOException{
        RandomAccessFile hi=CrearArchivoRecibos(code);
        
        hi.seek(hi.length());
        double salario=salario(code);
        
        hi.writeLong(new Date().getTime());
        hi.writeDouble(salario+(venta*0.10));
        hi.writeDouble(salario-(salario*0.35));
        hi.writeInt(Calendar.getInstance().get(Calendar.YEAR));
        hi.writeInt(Calendar.getInstance().get(Calendar.MONTH));
        
    }
    
    
}
