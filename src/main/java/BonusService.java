public class BonusService {

    public int calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = 500;
        }
        return (int) bonus;
    }
}
