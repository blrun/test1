package javaStudy;

public class CarConstruct {
    String name;
    int number;

    CarConstruct(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    CarConstruct(){
//        this.name = "이름없음";
//        this.number = 0;
    	this("이름없음", 0);
    }
    
    CarConstruct(String name) {
        this.name = name;
        this.number = 0;
    }

}
