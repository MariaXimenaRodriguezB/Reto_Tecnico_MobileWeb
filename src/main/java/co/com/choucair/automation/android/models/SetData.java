package co.com.choucair.automation.android.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetData {

    public List<DataProcess> setData(DataTable dataTable) {
        List<DataProcess> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            data.add(new ObjectMapper().convertValue(map, DataProcess.class));
        }
        return data;
    }


}
