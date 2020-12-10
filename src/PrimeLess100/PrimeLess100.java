package PrimeLess100;

public class PrimeLess100 {
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public void display(){
        System.out.print("Hien thi cac so nguyen to nho hon 100: ");
        for(int i = 0; i < 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        PrimeLess100 prime = new PrimeLess100();
        prime.display();
    }
}
