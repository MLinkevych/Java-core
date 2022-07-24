package Homework3;

public class Student {
    private String name;
    private double rating;
    public static double avgRating;
    static double totalRating = 0;
    static int count = 0;

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;

    }

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        totalRating += rating;
        count +=1;
        avgRating = totalRating/count;
    }
    public static boolean betterStudent(double ratingStudent1, double ratingStudent2){
        boolean result = false;
        if (ratingStudent1 > ratingStudent2) {
            return result = true;
        }
            return result;
    }
    @Override
    public String toString(){
        return ("Name of a student: " + name + ", rating: " + rating);
    }
}
