package com.ksimeo.arsu.admin.services;

import com.ksimeo.arsu.core.models.ProdType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author Ksimeo on 17.11.2015 at 16:25. For project: MArsMarketSpace.
 */
public class TypeServiceMock implements ITypeService {

    public void addType(ProdType prodType) {

    }

    public List<ProdType> getAllTypes() {
        List<ProdType> types = new ArrayList<ProdType>();
        types.add(new ProdType(1, "Кофеварки"));
        types.add(new ProdType(2, "Электрочайники"));
        types.add(new ProdType(3, "Микроволновки"));
        return types;
    }
}
