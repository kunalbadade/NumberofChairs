# NumberofChairs
This question has appeared in Google's coding interview round. 

There are N guests who are invited to a party. The k-th guest will attend the party at time Sk and leave the party at time Ek.
Write a function:
Class Solution{ public int solution(int[] S, int[] E);}

that, given an integer array S and an integer array E, both of length N, returns an integer denoting the minimum number of chairs you need
such that everyone attending the party can sit down.

For example, given
S = [1,2,6,5,3]
E = [5,5,7,6,8]

There are five guests attenfing the party.

The first guest will arrive at 1. We need one chair at time 1.
The second guest will arrive at time 2. There are now two guests at the party. So we need two chairs at time 2.
The fifth guest will arrive at time 3. There are now three guests at the party. So we need three chairs at time 3.
The fourth guest will arrive at time 5 and, at the same moment, the first and second guests will leave the party. There are now two (the
fourth and fifth) guests at the party. so we need two chairs at time 5.
The third guest will arrive at time 6, and the fourth guest will leave the party at the same time. There are now two (the third and fifth)
guests at the party, so we need two chairs at the time 6.

So we need at least 3 chairs; your function should return 3.
