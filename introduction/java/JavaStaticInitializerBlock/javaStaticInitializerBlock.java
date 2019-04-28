// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static Scanner sc = new Scanner(System.in);
static int B = sc.nextInt();
static int H = sc.nextInt();
static boolean flag = true;

static {
    if (B <= 0 || H <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }
}


public static void main(String[] args){