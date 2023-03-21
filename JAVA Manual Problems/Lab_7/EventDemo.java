interface EventListener{
	public void performEvent();
}

interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}

interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased();
}

public class EventDemo implements MouseListener,KeyListener{
	public void performEvent(){
			System.out.println("abcd");
	}
		public void mouseClicked(){
			System.out.println("abcd");
		}
		public void mousePressed(){
			System.out.println("abcd");
		}
		public void mouseReleased(){
			System.out.println("abcd");
		}
		public void mouseMoved(){
			System.out.println("abcd");
		}
		public void mouseDragged(){
			System.out.println("abcd");
		}
		public void keyPressed(){
			System.out.println("abcd");
		}
		public void keyReleased(){
			System.out.println("abcd");
		}
		public static void main(String[] args){

		}
}
