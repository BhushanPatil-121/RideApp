
import java.util.Scanner;
class Ride
{
    String starting_point;
    String destination_point;

}
class Bike extends Ride
{
    double price=10;
    Bike(String start,String end)
    {
        this.starting_point=start;
        this.destination_point=end;
        this.price=RideDriver.distance*price;
    }
    public void getBikeAttrribute()
    {
        System.out.println("-------------------------------------------------");
        System.out.println("Your Vehicle is \"BIKE\"");
        System.out.println("Starting point is \""+this.starting_point+"\"");
        System.out.println("Destination point is \""+this.destination_point+"\"");
        System.out.println("Per Km Price is \"10 Rs\"");
        System.out.println("Total Distance is \""+RideDriver.distance+" Km\"");
        System.out.println("Total Price of your ride is \""+this.price+" Rs\"");
        System.out.println("-------------------------------------------------");
    }

}
class Auto extends Ride
{
    double price=15;
    Auto(String start,String end)
    {
        this.starting_point=start;
        this.destination_point=end;
        this.price=RideDriver.distance*price;
    }
    public void getBikeAttrribute()
    {
        System.out.println("-------------------------------------------------");
        System.out.println("Your Vehicle is \"AUTO\"");
        System.out.println("Starting point is \""+this.starting_point+"\"");
        System.out.println("Destination point is \""+this.destination_point+"\"");
        System.out.println("Per Km Price is \"15 Rs\"");
        System.out.println("Total Distance is \""+RideDriver.distance+" Km\"");
        System.out.println("Total Price of your ride is \""+this.price+" Rs\"");
        System.out.println("-------------------------------------------------");
    }

}
class Car1 extends Ride
{
    double price=20;
    Car1(String start,String end)
    {
        this.starting_point=start;
        this.destination_point=end;
        this.price=RideDriver.distance*price;
    }
    public void getBikeAttrribute()
    {
        System.out.println("-------------------------------------------------");
        System.out.println("Your Vehicle is \"CAR for (4-peoples) \"");
        System.out.println("Starting point is \""+this.starting_point+"\"");
        System.out.println("Destination point is \""+this.destination_point+"\"");
        System.out.println("Per Km Price is \"20 Rs\"");
        System.out.println("Total Distance is \""+RideDriver.distance+" Km\"");
        System.out.println("Total Price of your ride is \""+this.price+" Rs\"");
        System.out.println("-------------------------------------------------");
    }

}
class Car2 extends Ride
{
    double price=30;
    Car2(String start,String end)
    {
        this.starting_point=start;
        this.destination_point=end;
        this.price=RideDriver.distance*price;
    }
    public void getBikeAttrribute()
    {
        System.out.println("-------------------------------------------------");
        System.out.println("Your Vehicle is \"CAR for (6-peoples)\"");
        System.out.println("Starting point is \""+this.starting_point+"\"");
        System.out.println("Destination point is \""+this.destination_point+"\"");
        System.out.println("Per Km Price is \"30 Rs\"");
        System.out.println("Total Distance is \""+RideDriver.distance+" Km\"");
        System.out.println("Total Price of your ride is \""+this.price+" Rs\"");
        System.out.println("-------------------------------------------------");
    }

}
class RideDriver 
{
    static int vehicle;
    static int sp;
    static int ep;
    static String start;
    static String end;
    static boolean quit=true;
    static double distance;
    static String name;
    static{
        System.out.println(" ");
        System.out.println("----------WELCOMME TO RIDE APP----------");
        System.out.println(" ");
    }
    public static void feedback()
    {
        System.out.println("Thank you for using Ride App....");
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name:-");
        name=s.nextLine();
        do
        {
        System.out.println("--------------------------");
        System.out.println("Choose Your Starting Point");
        System.out.println("--------------------------");
        System.out.println("1.Hinjewadi chowk");
        System.out.println("2.Dange Chowk ");
        System.out.println("3.Phase 1");
        System.out.println("4.Phase 2");
        System.out.println("5.Phase 3");
        System.out.println("--------------------------");
        sp=s.nextInt();
        switch(sp)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            {
                quit=false;
            }
            break;
            default:
            {
                System.out.println("Invalid Starting Point.... ");
                System.out.println("___________________________");
                quit=true;
            }
        }
        }while(quit);
        do
        {
        System.out.println("--------------------------");
        System.out.println("Choose Your Destination Point");
        System.out.println("-----------------------------");
        System.out.println("1.Hinjewadi chowk");
        System.out.println("2.Dange Chowk ");
        System.out.println("3.Phase 1");
        System.out.println("4.Phase 2");
        System.out.println("5.Phase 3");
        System.out.println("-----------------------------");
        ep=s.nextInt();
        switch(ep)
        {
            case 1:
            {
                if (sp==ep)
                {
                    System.out.println("Starting And Destination Point Won't be same....");
                    System.out.println("Please \""+RideDriver.name+"\" use your legs to go there. Thank You ");
                    System.out.println("________________________________________________");
                    quit=true;
                }
                else
                {
                    quit=false;
                }
            }
            break;
            case 2:
            {
                if (sp==ep)
                {
                    System.out.println("Starting And Destination Point Won't be same....");
                    System.out.println("Please \""+RideDriver.name+"\" use your legs to go there. Thank You ");
                    System.out.println("________________________________________________");
                    quit=true;
                }
                else
                {
                    quit=false;
                }
            }
            break;
            case 3:{
                if (sp==ep)
                {
                    System.out.println("Starting And Destination Point Won't be same....");
                    System.out.println("Please \""+RideDriver.name+"\" use your legs to go there. Thank You ");
                    System.out.println("________________________________________________");
                    quit=true;
                }
                else
                {
                    quit=false;
                }
            }
            break;
            case 4:
            {
                if (sp==ep)
                {
                    System.out.println("Starting And Destination Point Won't be same....");
                    System.out.println("Please \""+RideDriver.name+"\" use your legs to go there. Thank You ");
                    System.out.println("________________________________________________");
                    quit=true;
                }
                else
                {
                    quit=false;
                }
            }
            break;
            case 5:
            {
                if (sp==ep)
                {
                    System.out.println("Starting And Destination Point Won't be same....");
                    System.out.println("Please \""+RideDriver.name+"\" use your legs to go there. Thank You ");
                    System.out.println("________________________________________________");
                    quit=true;
                }
                else
                {
                    quit=false;
                }
            }
            break;
            default:
            {
                System.out.println("Invalid Destination Point....");
                System.out.println("_____________________________");
                quit=true;
            }
        }
    }while(quit);
        if(sp==1 && ep==2 || sp==2 && ep==1)
        {   
            if(sp==1)
            {
                start="Hinjewadi chowk";
                end="Dange Chowk";
                distance=4;//hinje- dange 
            }
            else{
                end="Hinjewadi chowk";
                start="Dange Chowk";
                distance=4;//dange -hinje
            }
        }
        else if(sp==1 && ep==3 || sp==3 && ep==1)
        {
            if(sp==1)
            {
                start="Hinjewadi chowk";
                end="Phase 1";
                distance=1;//hinje -ph1 
            }
            else{
                end="Hinjewadi chowk";
                start="Phase 1";
                distance=1;//ph1 -hinje
            }
        }
        else if(sp==1 && ep==4 || sp==4 && ep==1)
        {
            if(sp==1)
            {
                start="Hinjewadi chowk";
                end="Phase 2";
                distance=5;//hinje-ph2 
            }
            else
            {
                end="Hinjewadi chowk";
                start="Phase 2";
                distance=5;// ph2-hinje
            }
        }
        else if(sp==1 && ep==5 || sp==5 && ep==1)
        {
            if(sp==1)
            {
                start="Hinjewadi chowk";
                end="Phase 3";
                distance=7;//hinje-ph3 
            }
            else
            {
                end="Hinjewadi chowk";
                start="Phase 3";
                distance=7;// ph3-hinje
            }
        }
        else if(sp==2 && ep==3 || sp==3 && ep==2)
        {
            if(sp==2)
            {
                start="Dange chowk";
                end="Phase 1";
                distance=5;//dange-ph1 
            }
            else
            {
                end="Dange chowk";
                start="Phase 1";
                distance=5;//ph1-dange
            }
        }
        else if(sp==2 && ep==4 || sp==4 && ep==2)
        {
            if(sp==2)
            {
                start="Dange chowk";
                end="Phase 2";
                distance=7;//dange-ph2
            }
            else
            {
                end="Dange chowk";
                start="Phase 2";
                distance=7;//ph2-dange
            }
        }
        else if(sp==2 && ep==5 || sp==5 && ep==2)
        {
            if(sp==2)
            {
                start="Dange chowk";
                end="Phase 3";
                distance=11;//dange-ph3
            }
            else
            {
                end="Dange chowk";
                start="Phase 3";
                distance=11;//ph3-dange
            }
        }
        else if(sp==3 && ep==4 || sp==4 && ep==3)
        {
            if(sp==3)
            {
                start="Phase 1";
                end="Phase 2";
                distance=4;//ph1-ph2
            }
            else
            {
                end="Phase 1";
                start="Phase 2";
                distance=4;//ph2-ph1
            } 
        }
        else if(sp==3 && ep==5 || sp==5 && ep==3)
        {
            if(sp==3)
            {
                start="Phase 1";
                end="Phase 3";
                distance=6;//ph1-ph3
            }
            else
            {
                end="Phase 1";
                start="Phase 3";
                distance=6;//ph3-ph1
            }  
        }
        else if(sp==4 && ep==5 || sp==5 && ep==4)
        {
            if(sp==4)
            {
                start="Phase 2";
                end="Phase 3";
                distance=2;//ph2-ph3
            }
            else
            {
                end="Phase 2";
                start="Phase 3";
                distance=2;//ph3-ph2
            } 
        }
        do
        {
            System.out.println("---------------------------------");
            System.out.println("Choose Your Ride Vehicle:- ");
            System.out.println("---------------------------------");
            System.out.println("1.BIKE (Rs.10 km/hr) for 1-Person");
            System.out.println("2.AUTO (Rs.15 km/hr) for 3-people");
            System.out.println("3.CAR  (Rs.20 km/hr) for 4-people");
            System.out.println("4.CAR  (Rs.30 km/hr) for 6-people");
            System.out.println("---------------------------------");
            vehicle = s.nextInt();
            switch(vehicle)
            {
                case 1:
                {
                    Bike b1=new Bike( start, end);
                    b1.getBikeAttrribute();
                    feedback();
                    quit=false;
                }
                break;
                case 2:
                {
                    Auto a1=new Auto( start, end);
                    a1.getBikeAttrribute();
                    feedback();
                    quit=false;
                }
                break;
                case 3:
                {
                    Car1 c1=new Car1( start, end);
                    c1.getBikeAttrribute();
                    feedback();
                    quit=false;
                }
                break;
                case 4:
                {
                    Car2 ca1=new Car2( start, end);
                    ca1.getBikeAttrribute();
                    feedback();
                    quit=false;
                }
                break;
                default:
                {        
                    System.out.println("Invalid Choise ");
                    System.out.println("_______________");
                    quit=true;
                }
            }
        }while(quit);
    }
}