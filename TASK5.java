public class TASK5 {
    public static void main(String[] args){
        double length = 36;
        double width = 36;
        double radius = 36;
        double area_r = length * width;
        double perimeter_r = 2 * (length+width);
        double area_c = 3.142 * Math.pow(36,2);
        double perimeter_c = 2 * 3.142 * 36;
        System.out.println("Area of rectangle = "+area_r+"sq");
        System.out.println("Perimeter of rectangle =" +perimeter_r+"");
        System.out.println("Area of Circle = "+area_c+"sq");
        System.out.println("Perimeter of circle = "+perimeter_c+"");
    }
}