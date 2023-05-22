package com.braymatter.repositories;

import com.braymatter.entities.Player;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CassandraRepository<Player, Integer> {
    List<Player> findByName(String name);

    List<Player> findByNameContaining(String name);
}
