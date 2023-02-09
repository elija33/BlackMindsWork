# BlackMindsWork
Code_Karat_Studio

/*
We have a hallway which contains a fan that blows wind in a given direction ('<'=left, '>'=right) and a number of candles 'i' that blow out when the wind hits them. Open spaces are represented by '.'.

Write a function that takes in a hallway, and returns the number of candles that will be blown out.

Examples:
..>.ii. 
2 (Wind blows to the right and blows out both candles)

i>.i.i. 
3 (Wind blows to the right and blows out 2 candles, however the first candle will not be blown out)

i.<.... 
1 (Wind blows to the left and blows out the candle)

.i<i... 
1 (Wind blows to the left and blows out the candle but the candle to the right will not be blown out)

<iiii 
0 (Wind blows to the left and doesn't blow out any candles)

iiii> 
0 (Wind blows to the right and doesn't blow out any candles)

All Test Cases:
candles_blown_out(hallway1) => 2
candles_blown_out(hallway2) => 2
candles_blown_out(hallway3) => 1
candles_blown_out(hallway4) => 1
candles_blown_out(hallway5) => 0
candles_blown_out(hallway6) => 0

Complexity Analysis variable:
n = length of the hallway

*/