package Prime20;
import java.lang.Math;

public class Main {

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
        int i = 0;
        int count  = 0;
        System.out.print("Hien thi 20 so nguyen to dau tien: ");
        while(count < 20){
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Main prime = new Main();
        prime.display();
    }
}
