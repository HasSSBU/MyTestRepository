
public class PaintCalc {
    public static void main(String[] args) {

        final float PAINT_PER_SQ_METER = 6.5f; //in ml
        final int PAINT_COST = 30; //per 1 litre can
        final int LABOUR_COST = 200;
        int paintLayers = 2;
        //walls in sq metres, assumes a rectangular room
        int wallAH = 5;
        int wallAL = 15;
        int wallBH = 5;
        int wallBL = 20;

        String userText1 = "You require ";
        String userText2 = "ml of paint ";
        String userText3 = "This will cost: £";

        float amount = calculatePaint(PAINT_PER_SQ_METER, calculateMeterSq(wallAH, wallAL), calculateMeterSq(wallBH, wallBL));
        System.out.println(userText1 + amount + userText2);
        System.out.println(userText3 + calculateCost(amount, PAINT_COST, LABOUR_COST, paintLayers));
    }

    public static float calculateMeterSq(int Height, int Length){
        return Height * Length * 2;
    }
    public static float calculatePaint(float paint, float wall1, float wall2){
        return paint * (wall1 + wall2);
    }
    public static int calculateCost(float ml, int cost, int labour, int layers){
        int roundUp = (int)Math.ceil((ml * layers)/1000);
        return (roundUp * cost) + labour;
    }
}
