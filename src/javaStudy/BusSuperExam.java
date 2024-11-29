package javaStudy;

public class BusSuperExam {

	public static void main(String[] args) {
		CarSuper[] car = new CarSuper[200];
		for(int i=0; i<car.length/2; i++) {
			car[i] = new BusSuper("bus"+(i+1), i+1, (i+1)*1000);
			car[i+100] = new TruckSuper("truck"+(i+1), i+1, (i+1)*2000);
		}
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i].name + ' ' + car[i].number);
		}
//        car[0] = new BusSuper(new String("버스1"), 3000, 1050);
//        car[1] = new Truck(new String("트럭"), 3000, 5000);
//        car[2] = new BusSuper(new String("버스2"), 3000, 2000);
//        for(int i=0; i < car.length; i++) {
//        	System.out.println(car[i].name);
//        }
		BusSuper bus = new BusSuper(new String("버스1"), 3000, 1050);
		TruckSuper truck = new TruckSuper(new String("트럭"), 3000, 5000);
		BusSuper bus2 = new BusSuper(new String("버스2"), 3000, 2000);
		
		System.out.println(bus.name);
		System.out.println(truck.name);
		System.out.println(bus2.name);

//        if(!car.name.equals("뛰뛰")){
//            System.out.println("bus의 name이 다릅니다.");
//        }
//        else if(car.number != 3000){
//            System.out.println("bus의 number가 다릅니다.");
//        }
//      else if(bus.fee != 1050){
//          System.out.println("bus의 fee가 다릅니다.");
//      }
//        else{
//            System.out.println("정답입니다. [제출]을 누르세요.");
//        }
	}

}
