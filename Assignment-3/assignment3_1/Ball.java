package assignment3_1;

public abstract class Ball implements Tossable {
    private String brandname;
    public Ball(String brandname){
        this.brandname=brandname;
    }
    public String getBrandName(){
        return brandname;
    }
    public void bounce(){};
}
