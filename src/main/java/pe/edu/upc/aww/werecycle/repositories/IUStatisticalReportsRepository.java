package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.StatisticalReports;

@Repository
public interface IUStatisticalReportsRepository extends JpaRepository<StatisticalReports,Integer> {
}
