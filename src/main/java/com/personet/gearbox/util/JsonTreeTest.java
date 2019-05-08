package com.personet.gearbox.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.personet.gearbox.model.ZtreeNode;

import java.util.ArrayList;
import java.util.List;

public class JsonTreeTest {
    public static void main(String[] args) {
        String jsonstr1 = "{\"data\":[{\"id\":\"DDID-DEP-12805360075145378\",\"pId\":\"\",\"name\":\"集团总部A\",\"icon\":\"\",\"userList\":[{\"userId\":\"DDID-USER-12846223132197838\",\"userName\":\"马云\"},{\"userId\":\"DDID-USER-12993307483308083\",\"userName\":\"王健林\"},{\"userId\":\"DDID-USER-13001833253437493\",\"userName\":\"王思聪\"},{\"userId\":\"DDID-USER-13016557676397090\",\"userName\":\"马化腾\"}]},{\"id\":\"DDID-DEP-12804949981266050\",\"pId\":\"DDID-DEP-12805360075145378\",\"icon\":\"\",\"name\":\"投资团队A1\",\"userList\":[{\"userId\":\"DDID-USER-12805356233162891\",\"userName\":\"宋希平\"},{\"userId\":\"DDID-USER-12805356233162892\",\"userName\":\"叶潇予\"},{\"userId\":\"DDID-USER-12805356233162893\",\"userName\":\"郝志垚\"},{\"userId\":\"DDID-USER-12805356233162894\",\"userName\":\"张昆\"}]},{\"id\":\"DDID-DEP-13007636853162234\",\"pId\":\"DDID-DEP-12805360075145378\",\"icon\":\"\",\"name\":\"投资团队A2\",\"userList\":[{\"userId\":\"DDID-USER-12805356233162898\",\"userName\":\"高伟哲\"},{\"userId\":\"DDID-USER-12805356233162899\",\"userName\":\"蔡仲秋\"},{\"userId\":\"DDID-USER-12805356233162902\",\"userName\":\"于一文\"}]},{\"id\":\"DDID-DEP-13047482799882275\",\"pId\":\"\",\"icon\":\"\",\"name\":\"集团总部B\",\"userList\":[{\"userId\":\"DDID-USER-12805358523252896\",\"userName\":\"王维东\"},{\"userId\":\"DDID-USER-12805356233162907\",\"userName\":\"李昌浩\"},{\"userId\":\"DDID-USER-12846223895561167\",\"userName\":\"管卫萍\"},{\"userId\":\"DDID-USER-13012829099524551\",\"userName\":\"马骁\"}]}]}";
        String jsonstr = "{\"data\":[{\"id\":\"DDID-DEP-12805360075145378\",\"pId\":\"\",\"name\":\"集团总部A\",\"icon\":\"\"},{\"id\":\"DDID-USER-12846223132197838\",\"pId\":\"DDID-DEP-12805360075145378\",\"name\":\"马云\",\"icon\":\"\"},{\"id\":\"DDID-USER-12993307483308083\",\"pId\":\"DDID-DEP-12805360075145378\",\"name\":\"王健林\",\"icon\":\"\"},{\"id\":\"DDID-USER-13001833253437493\",\"pId\":\"DDID-DEP-12805360075145378\",\"name\":\"王思聪\",\"icon\":\"\"},{\"id\":\"DDID-USER-13016557676397090\",\"pId\":\"DDID-DEP-12805360075145378\",\"name\":\"马化腾\",\"icon\":\"\"},{\"id\":\"DDID-DEP-12804949981266050\",\"pId\":\"DDID-DEP-12805360075145378\",\"name\":\"投资团队A1\",\"icon\":\"\"},{\"id\":\"DDID-USER-12805356233162891\",\"pId\":\"DDID-DEP-12804949981266050\",\"name\":\"宋希平\",\"icon\":\"\"},{\"id\":\"DDID-USER-12805356233162892\",\"pId\":\"DDID-DEP-12804949981266050\",\"name\":\"叶潇予\",\"icon\":\"\"},{\"id\":\"DDID-USER-12805356233162893\",\"pId\":\"DDID-DEP-12804949981266050\",\"name\":\"郝志垚\",\"icon\":\"\"},{\"id\":\"DDID-DEP-13007636853162234\",\"pId\":\"DDID-DEP-12805360075145378\",\"name\":\"投资团队A2\",\"icon\":\"\"},{\"id\":\"DDID-DEP-13047482799882275\",\"pId\":\"\",\"name\":\"集团总部B\",\"icon\":\"\"},{\"id\":\"DDID-USER-12805358523252896\",\"pId\":\"DDID-DEP-13047482799882275\",\"name\":\"王维东\",\"icon\":\"\"},{\"id\":\"DDID-USER-12805356233162907\",\"pId\":\"DDID-DEP-13047482799882275\",\"name\":\"李昌浩\",\"icon\":\"\"},{\"id\":\"DDID-USER-12846223895561167\",\"pId\":\"DDID-DEP-13047482799882275\",\"name\":\"马骁\",\"icon\":\"\"}]}";
        JSONObject json = JSONObject.parseObject(jsonstr);
        String data = json.getString("data");
        List<ZtreeNode> hisActivityList = JSON.parseObject(data, new TypeReference<ArrayList<ZtreeNode>>() {
        });
        System.out.println(111);
    }
}
