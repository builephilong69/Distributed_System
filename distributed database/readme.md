## Cloud Based Service
- Cloud computing widely adopted : On - demand provisioning and elasticity ( co giãn theo cầu giá)
                                  - abilty to scale up at short notice and to release unused resources for use by others
- Infrastructure as a service: Virtual vs Real machine
- Software as a service : Enterpirse application, emails shared doc, etc...
- Potential drawbacks : Security + Network bandith



## I/O parallelism
- Reduce the time required to retrieve realtions from disk by partiontioning the frelations on multiple disks. on multiple nodes(computer)
- Horizontal partitioning : - tuples of a relation are dicided among many nodes such that some subset ò tuple resides on each node. ( chia ngang cái bảng ra theo tuples)
- Partitioning techniques( number of nodes = n):
    - Round robin: Send the I(th) tuple inserted in the realtion to node i mod n
    - Hash partitioning: 
    + Choose one or more attributes ass the partitioning attributes
    + Choose hash Function h with range 0..n-1
    + Let i denote result of hash function h applied to the partitioning attribute value of a tuple. Sned tuple to node i.
### Type of skew
- Note that **execuition skew** can occur even without data distribution skew
        + E.g relation range-partitioned on date, and most queries access tuples with recent dates

## Handling skew in Range-Partitioning
-  To create a balanced partitioning vetor:
        + Sort the relation on the partitioning attribute
        + Construct the partition vector by scanning the relation in sorted order as follow
        + After every 1/n (th) has been read, the value òf the partitioning attribute òf the next tuple is added to the partition vector
        + n denotes the number of partitions to be constructed
        + imbalances can result if duplicates are present in partitioning attributes
- To reduce cost
        + Partitioning vector can be created using a random sample of tuples
        + Alternatively, histograms can be used to create the partitioning vector.
## Virtual Node partitioning
- Key idea: pretend there are several times (10x to 20x) as many virtual nodes as real nodes

        + Virtual nodes are mapped to real nodes
        + Tuple partitioned accross virtual nodes using range-partitioning vector
        + Hash partitioning is also possible
- Mapping of virtual nodes to real nodes:
        
        
        + Round-robin: virtual node i mapped to real node (i mod n) +1


        + Mapping table: mapping table virtual_to_real_map[] tracks which virtual node is on which real node


          - Allows skew to be handled by moving virtual nodes from more loaded nodes to less loaded nodes
          - Both data distribution skew and execition skew can be handled
