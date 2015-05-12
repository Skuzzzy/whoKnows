import java.util.ArrayList;

/**
 * Created by dan on 5/11/15.
 */
public class ArrayListDataPack implements DataPack {

    ArrayList<StringObjectPair> dataList;

    public ArrayListDataPack() {
        dataList = new ArrayList<StringObjectPair>();
    }

    public Object getData(String s) {
        for(StringObjectPair datamember : dataList)
        {
            if(datamember.getIdentifier().equals(s)) {
                return datamember.getData();
            }
        }
        throw new IllegalArgumentException();
    }

    public void addData(String identifier, Object data) {
        dataList.add(new StringObjectPair(identifier,data));
    }

    private class StringObjectPair {
        String identifier;
        Object data;

        public StringObjectPair(String identifier, Object data) {
            this.identifier = identifier;
            this.data = data;
        }
        public String getIdentifier() {
            return identifier;
        }
        public Object getData() {
            return data;
        }
    }
}
