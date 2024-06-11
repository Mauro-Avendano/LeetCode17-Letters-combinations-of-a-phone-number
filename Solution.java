class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
      
        char[] d = new char[digits.length()];

        for (int i = 0; i < digits.length(); i++) {
            d[i] =  digits.charAt(i);
        }

        Map<Character, Character[]> map = new HashMap<>();
        map.put('2', new Character[] {'a', 'b', 'c'});
        map.put('3', new Character[] {'d', 'e', 'f'});
        map.put('4', new Character[] {'g', 'h', 'i'});
        map.put('5', new Character[] {'j', 'k', 'l'});
        map.put('6', new Character[] {'m', 'n', 'o'});
        map.put('7', new Character[] {'p', 'q', 'r', 's'});
        map.put('8', new Character[] {'t', 'u', 'v'});
        map.put('9', new Character[] {'w', 'x', 'y', 'z'});

        List<String> sol = new ArrayList<>();
        StringBuilder state = new StringBuilder();

        search(sol, state, map, d, 0);

        return sol;
    }

    private void search(List<String> sol, StringBuilder state, Map<Character, Character[]> map, char[] d, int index) {
        if (isValidState(state, d.length)) {
            sol.add(state.toString());
            return;
        }

        for (char c : getCandidates(index, map, d)) {
            state.append(c);
            search(sol, state, map, d, index + 1);
            state.deleteCharAt(state.length() - 1);
        }
    }

    private Character[] getCandidates(int index, Map<Character, Character[]> map, char[] d) {
        return map.get(d[index]);
    }

    private boolean isValidState(StringBuilder state, int length) {
        if (state.length() == length) return true;
        else return false;
    } 
}
