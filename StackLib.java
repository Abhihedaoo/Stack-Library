class StackLib {
    final int MAX = 9;
    // Class variables can be started with underscore to differentiate it with other variables
    int _top = -1;
    int[] items = new int[MAX];

    int numberOfItems() {
        return _top + 1;
    }

    boolean Push(int item) {
        if (_top == MAX - 1) {
            // Overflow condition
            return false;
        } else {
            items[++_top] = item;
            return true;
        }
    }

    boolean Pop() {
        if (_top == -1) {
            // Underflow condition
            return false;
        } else {
            // int item;
            // item = items[_top--];
            return true;
        }
    }

    // Not working Properly 
    // fix this 
    int[] getAllItems() {
        int[] stackItems = new int[_top + 1];
        for(int i = 0; i <= _top; i ++) {
            stackItems[i] = items[i];
        }
        return stackItems;
    }
}
