package hacker_rank;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book{

    public void setTitle(String s){
        this.title = s;
    }
    public String getTitle(){
        return this.title;
    }
}
