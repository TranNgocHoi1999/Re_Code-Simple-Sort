
package main;

import com.xtel.array.Array;
import com.xtel.validateInput.ValidateInput;
import com.xtel.validateInput.ValidateInteger;
import com.xtel.array.IArray;
/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        ValidateInteger validate = new ValidateInput();
        int[] create_array;
        IArray arr = new Array(validate);
        create_array = arr.addArray();
        SubClassOfMain subclassForSort = new SubClassOfMain(validate);
        subclassForSort.sort(create_array);
        arr.printAray();
    }

}
