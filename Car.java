package clock;

import java.util.Scanner;

public class Car {
	private  String name; //����
	private double tank;//����
	private double oilConsumption;//�ͺ�
	
	public Car( String name, double tank,double oilConsumption,String addtank,String run)//�вι��캯���Զ����ʼ��
	{
		this.name=name;
		this.tank=tank;
		this.oilConsumption=oilConsumption;
		
	}
	public String addtank()//addtank���������ж������Ƿ���Ҫ����
	{
		if(tank==0)
		{
			return "������Ҫ����";
		}
		else
		{
			return "��������Ҫ����";
		}	
	}
	public String run()//��run������ʾ�����������ܶ��
	{
	  double x=tank/oilConsumption;
	  return "��������"+x+"Сʱ";
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//String[]a=new String[10];
		Scanner sc=new Scanner(System.in);
		Car[]a=new Car[4];//��������
		a[0]=new Car("Car0",0,1,"��������Ҫ����","��������0Сʱ");
		a[1]=new Car("Car1",2,1,"��������Ҫ����","��������2Сʱ");
		a[2]=new Car("Car2",4,2,"��������Ҫ����","��������2Сʱ");
		a[3]=new Car("Car3",6,2,"��������Ҫ����","��������3Сʱ");

		for(int i=0;i<a.length;i++)		
		{
			System.out.print("��������������:");
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
						System.out.println("���������������������������");//��ѭ��ִ���껹û���ҵ���˵�����������������
					}
				}

			}
		}

	}

}

