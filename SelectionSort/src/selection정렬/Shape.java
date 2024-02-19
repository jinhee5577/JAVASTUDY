package selection정렬;

public class Shape {
   protected String name;
   
   public void paint() {
      draw();
   }
   
   public void draw() {
      System.out.println("Shape");
   }

}



//public class Circle extends Shape {
//   // 오버라이드
//   public void draw() {
//      System.out.println("Circle");
//      
//   }
//   
//   
//   
//   public static void main(String[] args) {
//      Shape b = new Circle();
//      b.paint();
//   }
//}