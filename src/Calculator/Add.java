package Calculator;

public class Add {
    public float addArray(float[] inputArray) {
        float result = 0;

        for (float input: inputArray) {
            result += input;   //result = result + input
        }
        return result;
    }

}
