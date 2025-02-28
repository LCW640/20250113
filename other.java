class Methods {
	//
	//1 方法名
	//2 形参（int, int）
	//3.int
	public int max(int n1, int n2) {
		return n1 > n2?n1:n2;
	}

	//分析
	//1 方法名 max
	//2 形参
	//3.double
	public double max(double n1, double n2, double n3) {
		System.out.println("max(double n1, double n2 double n3)");
		//求出n1和n2的最大值
		double max1 = n1 > n2?n1:n2;
		return max1 > n3?max1:n3;
	}

	//分析
	//1 方法名m
	//2 形参（int）
	//3.void
	public void m(int n) {
		System.out.println("平方="+(n * n));
	}

	//1 方法名 m
	//2 形参 (int, int)
	//3.void
	public void m(int n1, int n2) {
		System.out.println("相乘="+(n1*n2));
	}

	//1 方法名 m
	//2 形参(String)
	//3.void
	public void m(String str) {
		System.out.println("传入的str="+str);
	}
}


/*面向对象中，变量作用域是非常重要的知识点，相对来说不是特别好理解，请大家注意听，认真思考，
要求深刻掌握变量作用域。VarScope.java

1 在java编程中，主要的变量就是属性（成员变量）和局部变量
2 我们说的局部变量一般是指在成员方法中定义的变量 {举例Cat类：cry}
3 java中作用域的分类
  全局变量：也就是属性，作用域为整个类体 Cat类：cry eat等方法使用属性
  {举例}
  局部变量：也就是除了属性之外的其他变量，作用域为定义它的代码块中
4 全局变量（属性）可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，因为没有默认值{举例} 

*/

public class VarScopr {
	public static void main(String[] args) {
	
	}
}

class Cat {
	//全局变量：也就是属性，作用域为整个类体Cat类：cry eat等方法使用属性
	//属性在定义时，可以直接赋值
	int age = 10;//指定的值是10

	//全局变量（属性）可以不赋值，直接使用，因为有默认值，
	double weight; //默认值是0.0

	public void hi() {
		//局部变量必须赋值后，才能使用，因为没有默认值
		int num = 1;
		String address = "北京的猫"；
		System.out.println("num="+num);
		System.out.println("addres="+address);
		System.out.println("weight="+weight);//属性
	}

	public void cry() {
		//1,局部变量一般是指在成员方法中定义的变量
		//2,n和name就是局部变量
		//3,n和name的作用域在cry方法中
		int n = 10;
		String name = "jack";
		System.out.println("在cry中使用属性age="+age);
	}

	public void eat() {
		System.out.System.out.print();
	}

	public void eat() {
		System.out.println("在eat中使用属性 age="+age);

		// System.out.println("在eat中使用cry的变量name="+name);//错误
	}
}