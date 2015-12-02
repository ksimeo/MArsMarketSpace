package com.ksimeo.arsu.admin.services;

import com.ksimeo.arsu.core.models.ProdGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author Ksimeo on 17.11.2015 at 16:50. For project: MArsMarketSpace.
 */
public class GroupServiceMock implements IGroupService {

    public List<ProdGroup> getGroups(int id) {
        List<ProdGroup> groups = new ArrayList<ProdGroup>();
        groups.add(new ProdGroup(1, "Кухонная техника"));
        groups.add(new ProdGroup(2, "Электроника"));
        groups.add(new ProdGroup(3, "Самовары"));
        groups.add(new ProdGroup(4, "Компьютеры"));
        groups.add(new ProdGroup(5, "Ковры"));
        return groups;
    }

    public void addGroup(ProdGroup prodGroup) {

    }
}
