//FIXME
//методы в паскаль кейс
//переменные не просто буквами
//сначала private, потом протект и потом паблик
//package ru.denisov.math;
//
//public class Fraction {
//    private final long numerator;
//    private final long denominator;
//
//    public Fraction(long numerator, long denominator) {
//        if (denominator == 0) throw new IllegalArgumentException("denominator cannot be 0");
//        long g = gcd(Math.abs(numerator), Math.abs(denominator));
//        numerator /= g;
//        denominator /= g;
//        if (denominator < 0) {
//            numerator = -numerator;
//            denominator = -denominator;
//        }
//        this.numerator = numerator;
//        this.denominator = denominator;
//    }
//
//    public Fraction(long value) {
//        this(value, 1);
//    }
//
//    public long getNumerator() {
//        return numerator;
//    }
//
//    public long getDenominator() {
//        return denominator;
//    }
//
//    private static long gcd(long a, long b) {
//        while (b != 0) {
//            long t = b;
//            b = a % b;
//            a = t;
//        }
//        return Math.abs(a);
//    }
//
//    public Fraction add(Fraction other) {
//        long n = this.numerator * other.denominator + other.numerator * this.denominator;
//        long d = this.denominator * other.denominator;
//        return new Fraction(n, d);
//    }
//
//    public Fraction subtract(Fraction other) {
//        long n = this.numerator * other.denominator - other.numerator * this.denominator;
//        long d = this.denominator * other.denominator;
//        return new Fraction(n, d);
//    }
//
//    public Fraction multiply(Fraction other) {
//        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
//    }
//
//    public Fraction divide(Fraction other) {
//        if (other.numerator == 0) throw new ArithmeticException("division by zero");
//        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
//    }
//
//    @Override
//    public String toString() {
//        return numerator + "/" + denominator;
//    }
//}

//FIXDO:
package ru.denisov.math;

public class Fraction {
    private final long numerator;
    private final long denominator;

    public Fraction(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator cannot be 0");
        }
        long divisor = Gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= divisor;
        denominator /= divisor;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(long value) {
        this(value, 1);
    }

    public long GetNumerator() {
        return numerator;
    }

    public long GetDenominator() {
        return denominator;
    }

    public Fraction Add(Fraction other) {
        long newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        long newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction Subtract(Fraction other) {
        long newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        long newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction Multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction Divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("division by zero");
        }
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    private static long Gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}