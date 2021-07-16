package io.github.chaosunity.parse.expression;

public sealed interface ArithmeticExpression extends Expression permits Addition, Division, Multiplication, Subtraction {
}
