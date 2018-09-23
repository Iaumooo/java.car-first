package clock;

import java.util.Scanner;

public class Car {
	private  String name; //名字
	private double tank;//油量
	private double oilConsumption;//油耗
	
	public Car( String name, double tank,double oilConsumption,String addtank,String run)//有参构造函数对对象初始化
	{
		this.name=name;
		this.tank=tank;
		this.oilConsumption=oilConsumption;
		
	}
	public String addtank()//addtank函数用于判断汽车是否需要加油
	{
		if(tank==0)
		{
			return "汽车需要加油";
		}
		else
		{
			return "汽车不需要加油";
		}	
	}
	public String run()//用run函数表示汽车还可以跑多久
	{
	  double x=tank/oilConsumption;
	  return "还可以跑"+x+"小时";
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//String[]a=new String[10];
		Scanner sc=new Scanner(System.in);
		Car[]a=new Car[4];//对象数组
		a[0]=new Car("Car0",0,1,"汽车不需要加油","还可以跑0小时");
		a[1]=new Car("Car1",2,1,"汽车不需要加油","还可以跑2小时");
		a[2]=new Car("Car2",4,2,"汽车不需要加油","还可以跑2小时");
		a[3]=new Car("Car3",6,2,"汽车不需要加油","还可以跑3小时");

		for(int i=0;i<a.length;i++)		
		{
			System.out.print("请输入汽车名字:");
			String Cname =sc.next();	
		
		for(int j=0;j<a.length;j++)
			{
			if(Cname.equals(a[j].name)==true)
				{
				System.out.print(a[j].name+" ");
				System.out.print(a[j].tank+" ");
				System.out.print(a[j].oilConsumption+" ");
				System.out.print(a[j].addtank()+" ");
				System.out.println(a[j].run()+" ");
				
				break;
				}
			else
				{
				if(j==a.length-1)
					{
						System.out.println("您输入的汽车名有误请重新输入");//若循环执行完还没有找到则说明输入的汽车名有误
					}
				}

			}
		}

	}

}

