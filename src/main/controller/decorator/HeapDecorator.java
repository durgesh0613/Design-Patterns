package main.controller.decorator;

import main.controller.strategy.HeapStrategy;

/**
 * Implementing abstract decorator that implements HeapStrategy
 * It will have children such as OddHeapDecorator as concrete decorator classes
 */
public abstract class HeapDecorator implements HeapStrategy {
    protected HeapStrategy heapStrategy;

    /**
     * It implements min or max heap strategy as needed.
     * @param heapStrategy
     */
    public HeapDecorator(HeapStrategy heapStrategy){
        this.heapStrategy = heapStrategy;
    }

    @Override
    /**
     * It calls strategy's toString method for values.
     */
    public String toString() {
        return heapStrategy.toString();
    }
}
