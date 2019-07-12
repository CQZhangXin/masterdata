package com.yuanian.masterdata;

import com.yuanian.masterdata.config.Address;
import com.yuanian.masterdata.dao.ToC1EntityDAO;
import com.yuanian.masterdata.service.MasterDataService;
import com.yuanian.masterdata.service.impl.ChargeDataServiceImpl;
import com.yuanian.masterdata.service.impl.GetNcCompanyServiceImpl;
import com.yuanian.masterdata.service.impl.GetProjectServiceImpl;
import com.yuanian.masterdata.service.impl.ToC1ServiceImpl;
import com.yuanian.masterdata.util.AddressUtil;
import com.yuanian.masterdata.util.HelpUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MasterdataApplicationTests {

    @Autowired
    private GetProjectServiceImpl getProjectService;

    @Autowired
    private GetNcCompanyServiceImpl getNcCompanyService;

    @Autowired
    private MasterDataService masterDataService;

    @Autowired
    private ToC1ServiceImpl toC1Service;

    @Autowired
    private ToC1EntityDAO toC1EntityDAO;

    @Autowired
    private ChargeDataServiceImpl chargeDataService;

    @Test
    public void contextLoads() {
        getProjectService.newExcuterGetProject(AddressUtil.incorporatedCompanyAddr, 2,"incorporatedCompany");
    }

    @Test
    public void contextLoads1() {
        getNcCompanyService.getNcCompanyExcuter();
    }

    @Test
    public void contextLoads2() {
        masterDataService.getDataFromESB();
    }

    @Test
    public void contextLoad3() {
        getProjectService.testSelect();
    }

    @Test
    public void contextLoad4() {
        toC1Service.sysDataToC1();
//        List<Map<String,Object>> list = toC1EntityDAO.selectPage(1,1000);
//
//        for (Map<String,Object> map:
//                list) {
//            System.out.println(map.toString());
//        }
    }

    @Test
    public void testToEbase(){
        toC1Service.sysEbase();
    }

    @Test
    public void testChargeData(){
        chargeDataService.doCharge();
    }



}
