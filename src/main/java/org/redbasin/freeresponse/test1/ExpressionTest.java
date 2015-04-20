/*
 * Copyright (C) Tanisha (aceso1999@gmail.com) - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.freeresponse.test1;

/**
 * @author tanisha on 4/19/15.
 */
interface Expression {
  int evaluate();
}

class Constant implements Expression {

  private final int value;

  public Constant(int value) {
    this.value = value;
  }

  @Override
  public int evaluate() {
    return this.value;
  }

  @Override
  public String toString() {
    return String.format(" %d ", this.value);
  }

}

class Negate implements Expression {

  private final Expression expression;

  public Negate(Expression expression) {
    this.expression = expression;
  }

  @Override
  public int evaluate() {
    return -(this.expression.evaluate());
  }

  @Override
  public String toString() {
    return String.format(" -%s ", this.expression);
  }
}

class Exponent implements Expression {

  private final Expression expression;
  private final int exponent;

  public Exponent(Expression expression, int exponent) {
    this.expression = expression;
    this.exponent = exponent;
  }

  @Override
  public int evaluate() {
    return (int) Math.pow(this.expression.evaluate(), this.exponent);
  }

  @Override
  public String toString() {
    return String.format(" %s ^ %d", this.expression, this.exponent);
  }

}

class Addition implements Expression {

  private final Expression left;
  private final Expression right;

  public Addition(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int evaluate() {
    return this.left.evaluate() + this.right.evaluate();
  }

  @Override
  public String toString() {
    return String.format(" (%s + %s) ", this.left, this.right);
  }
}

class Multiplication implements Expression {

  private final Expression left;
  private final Expression right;

  public Multiplication(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int evaluate() {
    return this.left.evaluate() * this.right.evaluate();
  }

  @Override
  public String toString() {
    return String.format(" (%s * %s) ", this.left, this.right);
  }

}

public class ExpressionTest {
  public static void main(String[] args) {

    Expression two = new Constant(2);
    Expression four = new Constant(4);
    Expression negOne = new Negate(new Constant(1));
    Expression sumTwoFour = new Addition(two, four);
    Expression mult = new Multiplication(sumTwoFour, negOne);
    Expression exp = new Exponent(mult, 2);
    Expression res = new Addition(exp, new Constant(1));

    System.out.println(res + " = " + res.evaluate());

  }
}