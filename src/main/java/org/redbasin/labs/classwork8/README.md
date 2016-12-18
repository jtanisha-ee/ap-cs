Exercises
=====

(I) Which of the following can be used to replace
/* missing code */ so that advance will correctly update the time?

(a) minutes = minutes % 60;

(b) minutes = minutes + hours % 60;

(c) hours = hours + minutes / 60;

     minutes = minutes % 60;

(d) hours = hours + minutes % 60;

     minutes = minutes / 60;

(e) hours = hours + minutes / 60;

(II) Consider the following declaration that appears in a class
other than TimeRecord.

     TimeRecord[] timeCards = new TimeRecord[100];

Assume that timeCards has been initialized with TimeRecord objects.
Consider the following code segment that is intended to compute the total of all
the times stored in

      timeCards.TimeRecord total = new TimeRecord(0,0);
      for (int k = 0; k < timeCards.length; k++) {
       /* missing expression */ ;
      }

Which of the following can be used to replace
/*
missing expression
*/
so that the code segment will work as intended?

(a) timeCards[k].advance()

(b) total += timeCards[k].advance()

(c) total.advance (timeCards[k].hours, timeCards[k].minutes)

(d) total.advance(timeCards[k].getHours(), timeCards[k].getMinutes())

(e) timeCards[k].advance(timeCards[k].getHours(), timeCards[k].getMinutes()

