package com.pckg1;

import org.jboss.forge.roaster.Origin;

public class Class1 {

    // A class which is imported from the dependent module.
    public class InnerClass1 {
    }

    // Implement random dependency.
    private abstract class InnerClass2 implements Origin {
    }
}
