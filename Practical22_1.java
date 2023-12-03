class Obj{
    double basic,hra,da,gross;
    Obj(double basic,double hra,double gross,double da){
        this.basic=basic;
        this.da=da;
        this.gross=gross;
        this.hra=hra;
     
    }
}
class Employee{
    double basic,da,hra,gross;
    Employee(){
        basic =-1;
    }
    Employee(double basic){
        this.basic=basic;
    }
    Employee(Employee o){
        this.basic=o.basic;
    }
    
    Obj calculate(){
       da=basic*0.03;
       hra=basic*0.12;
       this.gross=basic+hra+da;
        
        return new Obj(hra,da,gross,basic);
    }
    void display(){
        System.out.println("Basic :"+basic);
        System.out.print("DA :"+da);
        System.out.print("HRA :"+hra);
        System.out.print("Gross :"+gross);
    }
   

}
class Practical22_1{
    public static void main(String[] args) {
        //createing an array of class employee

        Employee e[]=new Employee[10];
        for(int i=0;i<10;i++){
            int sal=i*10000;
            e[i]=new Employee(sal);
            Obj r=e[i].calculate();
        }

        for(int i=0;i<10;i++){
            if(e[i].gross>50000){
                e[i].display();
            }
        }
           
    }
}