interface Car {
    void reverse();
}

class TaxiCar implements Car {
    public void reverse(){
        System.out.println("Hello");
    }
    pblic static void main(String args[]){
        TaxiCar obj = new TaxiCar();
        obj.reverse();
    }
}
