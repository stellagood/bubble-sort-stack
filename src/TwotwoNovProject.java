import java.util.Arrays;
import java.util.Stack;

public class TwotwoNovProject {

    void bubblesort(int[] nums){
        int len = nums.length;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i=0; i<len; i++)
        {
            stack1.push(nums[i]);
        }

        for(int i=0; i<len-1; i++)
        {
            stack2.push(stack1.pop());
            for(int j=0; j<len-i-1; j++)
            {
                while(!stack1.isEmpty()) {
                    if (stack1.peek() > stack2.peek()) {
                        stack2.push(stack1.pop());
                    } else {
                        int temp = stack2.pop();
                        stack2.push(stack1.pop());
                        stack2.push(temp);
                    }
                }
            }

            while(!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
        }

        int n=0;
        while(!stack1.isEmpty())
        {
            nums[n]=stack1.pop();
            n++;
        }
    }

    public static void main(String[] args) {
        int[] num = {7, 2, 12, 8, 5};
        TwotwoNovProject oldbubblesort = new TwotwoNovProject();
        oldbubblesort.bubblesort(num);
        System.out.println(Arrays.toString(num));
    }
}
