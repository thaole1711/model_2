package case_study.service;

import case_study.model.Facility;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

import java.util.List;
import java.util.Map;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    public Map<Facility, Integer> getAll() {
        return iFacilityRepository.getAll();
    }

    @Override
    public List<Facility> findAll() {
        return List.of();
    }

    @Override
    public void update(Facility facility) {
    }

    @Override
    public void add(Facility facility) {
        iFacilityRepository.add(facility);
    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void delete(String id) {

    }
}
