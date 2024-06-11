# LeetCode 17 Letters combinations of a phone number

This is a Java implementation for the following [problem](https://leetcode.com/problems/letter-combinations-of-a-phone-number/).

## Explanation

We can use the Backtracking algorithm to solve this problem which basically consists in four parts:

- A search method wich has the recursion.
- A isValidState method that checks if the given state can be added as a solution.
- A getCandidates method to generate all the possible candidates for the given step, in this case is very straightforward because the candidates are all the letters of a given digit.
- The principal method that is responsible to generate the map of digits to letters and the data structures to be passed to the search method.
