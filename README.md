# **INVERTED TRIANGLE**

## INFORMATION

* **Inverted triangle construction with star symbol.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **i**, **n**, **k** and **j** are defined with int.

* Scanner class created for user to enter numbers.

## CODES

```Java

        import java.util.Scanner;

        public class invertedtriangle{

            public static void main(String[] args) {

                int n, i, k, j;

                Scanner input = new Scanner(System.in);

                System.out.print("Enter The Number : ");

                n = input.nextInt();


```

```Java

                for(i = n - 1; i >= 0; i--){

                    for(k = 0; k < (n - i); k++){

                        System.out.print(" ");

                    }

                    for(j = 0; j < (2 * i) - 1; j++){

                        System.out.print("*");

                    }

                    System.out.println();

                }
            }
        }

```

```bash

     *****************
      ***************
       *************
        ***********
         *********
          *******
           *****
            ***
             *

```

<br />

## LINK

* Click here https://github.com/Fogo9/InvertedTriangle.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
