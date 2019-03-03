class TestLib {
    public static void main(String[] args) {
        StackLib stack = new StackLib();

        // Push operation
        stack.Push(23);
        stack.Push(21);
        stack.Push(2);
        stack.Push(4);
        stack.Push(6);
        stack.Push(87);

        // All items after pushing items
        System.out.println("Before");
        int[] items = stack.getAllItems();
        for (int i = 0; i < stack.numberOfItems(); i++) {
            System.out.println(items[i]);
        }

        // Pop operation
        stack.Pop();
        stack.Pop();

        System.out.println("After");
        // All items after poping 
        int[] items1 = stack.getAllItems();
        for (int i = 0; i < stack.numberOfItems(); i++) {
            System.out.println(items1[i]);
        }
    }

}
