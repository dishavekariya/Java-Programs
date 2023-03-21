class Square{
	int l;
	String color;

	public Square(int l,String color){
		this.l = l;
		this.color = color;
	}

	public String toString(){
		return "Length = "+l+" Color = "+color;
	}

}

public class ToStringDemo{
	public static void main(String[] args){
		Square s1 = new Square(5,"red");
		Square s2 = new Square(10,"orange");

		System.out.println(s1);
		System.out.println(s2);
	}
}

/* toString method ma je kai bhi return karavie te, println ma just object nu nam nakhie tyare ave.
when we write - println(s1) to s1 na class ni toString method ma je return karavyu hase te sidhu print thase
aano upayog koi pan class na object ni koi chokkas vastu display karavi hoi tyare thay*/