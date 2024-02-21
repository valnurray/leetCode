class Solution {
    public String simplifyPath(String path) {
               StringBuilder simplifiedPath = new StringBuilder();
        String[] directories = path.split("/");

        for (String directory : directories) {
            if (directory.equals("") || directory.equals(".")) {
                continue;
            } else if (directory.equals("..")) {
                int length = simplifiedPath.length();
                if (length > 0) {
                    int index = simplifiedPath.lastIndexOf("/");
                    simplifiedPath.setLength(index);
                }
            } else {
                simplifiedPath.append("/").append(directory);
            }
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
}