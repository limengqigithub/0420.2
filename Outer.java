package cn.lmq.oop.nestedClasses;

public class Outer {
	public static void main(String[] args) {
		face.nose t=new face().new nose();//d调用内部对象必须要有外部对象，才能点用内部方法。
		t.breath();
		face.ear e=new face.ear();//调用静态的内部类对象。
		e.listen();
	}

}

class face{
	int type;
	static String shape="方的";  
	
	class nose{
		String shape="圆的";
		
		public void breath(){
			System.out.println(face.this.shape);//用face.this.shape访问的是外部的属性，使用this.shape或者shape访问的是内部类的属性。
			System.out.println("用鼻子呼吸！");
		}
	}
	static class ear{
		void listen(){
			System.out.println(shape);//静态内部类不能使用外部的普通属性，可以使用外部的静态属性。
			System.out.println("我再听");
		}
	}
	                  
}