package main.controller.decorator;

import main.controller.strategy.HeapStrategy;

public abstract class HeapDecorator implements HeapStrategy {
    protected HeapStrategy heapStrategy;

    public HeapDecorator(HeapStrategy heapStrategy){
        this.heapStrategy = heapStrategy;
    }

    @Override
    public String toString() {
        return heapStrategy.toString();
    }
}
