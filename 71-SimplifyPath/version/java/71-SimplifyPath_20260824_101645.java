// Last updated: 8/24/2026, 10:16:45 AM
1class Solution {
2    public String simplifyPath(String path) {
3        Deque<String> dirOrFiles = new ArrayDeque<>();
4        for (String dirOrFile : path.split("/")) {
5            if (!dirOrFiles.isEmpty() && dirOrFile.equals("..")) {
6                dirOrFiles.removeLast();
7            } else if (!dirOrFile.equals(".") && !dirOrFile.equals("") && !dirOrFile.equals("..")) {
8                dirOrFiles.addLast(dirOrFile);
9            }
10        }
11        StringBuilder simplified_path = new StringBuilder();
12        for (String dirOrFile : dirOrFiles) {
13            simplified_path.append("/").append(dirOrFile);
14        }
15        return simplified_path.length() == 0 ? "/" : simplified_path.toString();
16    }
17}