package assignment_4;

public class distance {
    private int kilometers;
    private int meters;
    private int centimeters;

    public distance() {
        this.kilometers = 0;
        this.meters = 0;
        this.centimeters = 0;
    }

    public distance(int kilometers, int meters, int centimeters) {
        this.kilometers = kilometers;
        this.meters = meters;
        this.centimeters = centimeters;
        normalize();
    }

    public distance(distance o) {
        this.kilometers = o.kilometers;
        this.meters = o.meters;
        this.centimeters = o.centimeters;
    }

   public distance addDistance(distance o)
   {
        distance temp = new distance();
        temp.kilometers = this.kilometers + o.kilometers;
        temp.meters = this.meters + o.meters;
        temp.centimeters = this.centimeters + o.centimeters;
        temp.normalize();
        return temp;
   }
   public void display() {
    System.out.println(this.kilometers + " km, " + this.meters + " m, " + this.centimeters + " cm");
}
   private void normalize() 
   {
    // Convert centimeters to meters
    this.meters += this.centimeters / 100;
    this.centimeters = this.centimeters % 100;

    // Convert meters to kilometers
    this.kilometers += this.meters / 1000;
    this.meters = this.meters % 1000;
    }
    public static void main(String[] args) 
    {

        distance d1 = new distance();
        d1.display();

        distance d2 = new distance(2, 1500, 75);
        d2.display();

        distance d3 = new distance(d2);
        d3.display();

        d2.addDistance(d3);
        d2.display();
    }
}
