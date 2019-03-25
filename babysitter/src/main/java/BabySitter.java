public class BabySitter {

    //time format accepted: xx:yy or xx
    public boolean validTimeFormat(String time) {
        String[] timeParts = time.split(":");
        System.out.println("timePartsLength: " + timeParts.length);
        Integer hour = 0, min=0;
        if (timeParts.length!=0 && timeParts.length <=2 ){
            try{
                hour = Integer.parseInt(timeParts[0]);
                if (hour==0 || hour>12){
                    return false;
                }

                if (timeParts.length==2){
                    min = Integer.parseInt(timeParts[1]);

                    if (min==0 || min >59){
                        return false;
                    }
                }
            }catch(NumberFormatException e){
                //e.printStackTrace();
                return false;
            }

        }else{
            return false;
        }
        return true;
    }

    /**
     *
     * @param startTime 10:30 or 10
     * @param endTime
     * @return
     */
    public int computeFamilyA(String startTime, String endTime) {



        int startime = Integer.parseInt(startTime);
        int endtime = Integer.parseInt(endTime);

        return 0;

    }


}
