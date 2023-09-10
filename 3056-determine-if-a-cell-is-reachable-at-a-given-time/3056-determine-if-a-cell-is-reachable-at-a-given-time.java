class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xdiff=Math.abs(sx-fx);
        int ydiff=Math.abs(sy-fy);
        int diagonaldiff=Math.min(xdiff,ydiff);
        xdiff-=diagonaldiff;
        ydiff-=diagonaldiff;
        diagonaldiff+=xdiff+ydiff;
        if(diagonaldiff==0){
            return t!=1;
        }
        return (diagonaldiff<=t);
    }
}